import { mixins } from 'vue-class-component';

import { Component, Vue, Inject } from 'vue-property-decorator';
import Vue2Filters from 'vue2-filters';
import { ITag } from '@/shared/model/tag.model';

import TagService from './tag.service';
import AlertService from '@/shared/alert/alert.service';

import AccountService from '@/account/account.service';
import LoginService from '@/account/login.service';

@Component({
  mixins: [Vue2Filters.mixin],
})
export default class Tag extends Vue {
  @Inject('tagService') private tagService: () => TagService;
  @Inject('alertService') private alertService: () => AlertService;

  private removeId: number = null;
  @Inject('accountService') private accountService: () => AccountService;
  @Inject('loginService')
  private loginService: () => LoginService;
  private hasAnyAuthorityValue = false;

  public tags: ITag[] = [];

  public isFetching = false;

  public propOrder = 'id';
  public reverse = false;

  public mounted(): void {
    this.retrieveAllTags();
  }

  public clear(): void {
    this.retrieveAllTags();
  }

  public retrieveAllTags(): void {
    this.isFetching = true;
    this.tagService()
      .retrieve({
        sort: this.sort(),
      })
      .then(
        res => {
          this.tags = res.data;
          this.isFetching = false;
        },
        err => {
          this.isFetching = false;
          this.alertService().showHttpError(this, err.response);
        }
      );
  }

  public handleSyncList(): void {
    this.clear();
  }

  public prepareRemove(instance: ITag): void {
    this.removeId = instance.id;
    if (<any>this.$refs.removeEntity) {
      (<any>this.$refs.removeEntity).show();
    }
  }

  public removeTag(): void {
    this.tagService()
      .delete(this.removeId)
      .then(() => {
        const message = this.$t('jHipsterExerciseApp.tag.deleted', { param: this.removeId });
        this.$bvToast.toast(message.toString(), {
          toaster: 'b-toaster-top-center',
          title: 'Info',
          variant: 'danger',
          solid: true,
          autoHideDelay: 5000,
        });
        this.removeId = null;
        this.retrieveAllTags();
        this.closeDialog();
      })
      .catch(error => {
        this.alertService().showHttpError(this, error.response);
      });
  }

  public closeDialog(): void {
    (<any>this.$refs.removeEntity).hide();
  }

  public get authenticated(): boolean {
    return this.$store.getters.authenticated;
  }

  public hasAnyAuthority(authorities: any): boolean {
    this.accountService()
      .hasAnyAuthorityAndCheckAuth(authorities)
      .then(value => {
        this.hasAnyAuthorityValue = value;
      });
    return this.hasAnyAuthorityValue;
  }

  public changeOrder(propOrder: string): void {
    this.propOrder = propOrder;
    this.reverse = !this.reverse;
    this.transition();
  }

  public transition(): void {
    this.retrieveAllTags();
  }

  public sort(): any {
    const result = [this.propOrder + ',' + (this.reverse ? 'desc' : 'asc')];
    if (this.propOrder !== 'id') {
      result.push('id');
    }
    return result;
  }
}
