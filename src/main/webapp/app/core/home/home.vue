<template>
  <div class="home row">
    <div class="container">
      <div class="card">
        <p class="price">$10000.0 USD</p>

        <i class="info fas fa-info-circle"></i>
        <p class="text">Wonderful Ferrari 458.</p>

        <div class="imgBx">
          <img src="/content/images/ferrari458.png" />
        </div>
        <div class="contentBx">
          <h2>Ferrari 458</h2>
          <div class="size">
            <h3>Size :</h3>
            <span>6</span>
            <span>7</span>
            <span>8</span>
            <span>9</span>
            <span>10</span>
          </div>
          <div class="color">
            <h3>Color:</h3>
            <span></span>
            <span></span>
            <span></span>
          </div>
          <button>Add to Cart</button>
        </div>
      </div>

      <div class="card">
        <p class="price">$20000.00 USD</p>
        <i class="info fas fa-info-circle"></i>
        <p class="text">Wonderful Lamborghini Gallardo.</p>
        <div class="imgBx">
          <img src="/content/images/lamborghiniGallardo.png" />
        </div>
        <div class="contentBx">
          <h2>Lamborghini Gallardo</h2>
          <div class="size">
            <h3>Size :</h3>
            <span>6</span>
            <span>7</span>
            <span>8</span>
            <span>9</span>
            <span>10</span>
          </div>
          <div class="color">
            <h3>Color:</h3>
            <span></span>
            <span></span>
            <span></span>
          </div>
          <button>Add to Cart</button>
        </div>
      </div>

      <div class="card">
        <p class="price">$30000.0 USD</p>
        <i class="info fas fa-info-circle"></i>
        <p class="text">Wonderful Mclaren P1.</p>
        <div class="imgBx">
          <img src="/content/images/mclarenP1.png" />
        </div>
        <div class="contentBx">
          <h2>Mclaren P1</h2>
          <div class="size">
            <h3>Size :</h3>
            <span>6</span>
            <span>7</span>
            <span>8</span>
            <span>9</span>
            <span>10</span>
          </div>
          <div class="color">
            <h3>Color:</h3>
            <span></span>
            <span></span>
            <span></span>
          </div>

          <button>Add to Cart</button>
        </div>
      </div>

      <div class="card">
        <p class="price">$15000.0 USD</p>

        <i class="info fas fa-info-circle"></i>
        <p class="text">Wonderful Lotus Elise.</p>

        <div class="imgBx">
          <img src="/content/images/lotusElise.png" />
        </div>
        <div class="contentBx">
          <h2>Lotus Elise</h2>
          <div class="size">
            <h3>Size :</h3>
            <span>6</span>
            <span>7</span>
            <span>8</span>
            <span>9</span>
            <span>10</span>
          </div>
          <div class="color">
            <h3>Color:</h3>
            <span></span>
            <span></span>
            <span></span>
          </div>
          <button>Add to Cart</button>
        </div>
      </div>

      <div class="card">
        <p class="price">$25000.0 USD</p>
        <i class="info fas fa-info-circle"></i>
        <p class="text">Wonderful Mercedes Class G.</p>
        <div class="imgBx">
          <img src="/content/images/mercedesClassG.png" />
        </div>
        <div class="contentBx">
          <h2>Mercedes Class G</h2>
          <div class="size">
            <h3>Size :</h3>
            <span>6</span>
            <span>7</span>
            <span>8</span>
            <span>9</span>
            <span>10</span>
          </div>
          <div class="color">
            <h3>Color:</h3>
            <span></span>
            <span></span>
            <span></span>
          </div>
          <button>Add to Cart</button>
        </div>
      </div>

      <div class="card">
        <p class="price">$35000.0 USD</p>
        <i class="info fas fa-info-circle"></i>
        <p class="text">Wonderful Bugatti Chiron.</p>
        <div class="imgBx">
          <img src="/content/images/bugattiChiron.png" />
        </div>
        <div class="contentBx">
          <h2>Bugatti Chiron</h2>
          <div class="size">
            <h3>Size :</h3>
            <span>6</span>
            <span>7</span>
            <span>8</span>
            <span>9</span>
            <span>10</span>
          </div>
          <div class="color">
            <h3>Color:</h3>
            <span></span>
            <span></span>
            <span></span>
          </div>

          <button>Add to Cart</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./home.component.ts"></script>

<style>
* {
  margin: 0;
  padding: 0;
  font-family: Quicksand;
}

.price {
  position: absolute;
  top: 1em;
  right: 1em;
  backdrop-filter: blur(8px);
  background-color: rgba(0, 0, 0, 0.112);
  box-shadow: rgba(0, 0, 0, 0.3) 2px 8px 8px;
  border: 0px rgba(255, 255, 255, 0.4) solid;
  border-bottom: 0px rgba(40, 40, 40, 0.35) solid;
  border-right: 0px rgba(40, 40, 40, 0.35) solid;
  padding: 5px 10px;
  font-size: 0.8em;
  border-radius: 4px;
}

.container {
  position: relative;
  padding: 0 20px;
  max-width: 100%;
  text-align: center;
}
.container .card {
  position: relative;
  width: 320px;
  height: 450px;
  border-radius: 20px;
  background: linear-gradient(315deg, #f0ff02, #e400ff);
  box-shadow: -20px -20px 25px #0e0e0e, 20px 20px 25px #dddddd;
  overflow: hidden;
  margin-left: 5%;
  margin-right: 5%;
  margin-bottom: 5%;
  display: inline-block;
}
.container .card:before {
  content: ' ';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: #9bdc28;
  clip-path: circle(150px at 80% 20%);
  transition: 0.5s ease-in-out;
}
.container .asics:before {
  background: #ebff6a;
}
.container .adidas:before {
  background: #87ff89;
}
.container .new-balance:before {
  background: #00fbff;
}
.container .card:hover:before {
  clip-path: circle(300px at 80% -20%);
}
.container .card:after {
  content: '';
  position: absolute;
  top: 30%;
  left: -20%;
  font-size: 12em;
  font-weight: 800;
  font-style: italic;
  color: rgba(255, 255, 255, 0.04);
}

.container .card .imgBx {
  position: absolute;
  top: 50%;
  transform: translateY(-50%);
  z-index: 200;
  width: 100%;
  height: 220px;
  transition: 0.5s ease-in-out;
}
.container .card:hover .imgBx {
  top: 0%;
  transform: translateY(0%);
}
.container .card .imgBx img {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 270px;
}
.container .card .contentBx {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 100px;
  text-align: center;
  transition: 1s;
  z-index: 10;
}
.container .card:hover .contentBx {
  height: 210px;
}
.container .card .contentBx h2 {
  position: relative;
  font-weight: 600;
  letter-spacing: 1px;
  color: #600505;
}
/* Shoe Size */
.container .card .contentBx .size,
.container .card .contentBx .color {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 8px 20px;
  transition: 0.5s;
  opacity: 0;
  visibility: hidden;
}
.container .card:hover .contentBx .size {
  opacity: 1;
  visibility: visible;
  translate-delay: 0.5s;
}
.container .card:hover .contentBx .color {
  opacity: 1;
  visibility: visible;
  translate-delay: 0.6s;
}
.container .card .contentBx .size h3,
.container .card .contentBx .color h3 {
  color: #fff;
  font-weight: 300;
  font-size: 14px;
  text-transform: uppercase;
  letter-spacing: 2px;
  margin-right: 10px;
}
.container .card .contentBx .size span {
  width: 26px;
  height: 26px;
  text-align: center;
  line-height: 26px;
  font-size: 14px;
  display: inline-block;
  color: #111;
  background: #fff;
  margin: 0 5px;
  transition: 0.5s;
  border-radius: 4px;
  cursor: pointer;
}
.container .asics .contentBx .size span:hover {
  background: #155eb4;
}
.container .adidas .contentBx .size span:hover {
  background: #99243a;
}
.container .new-balance .contentBx .size span:hover {
  background: #8a8576;
}

/* Shoe color */
.container .card .contentBx .color span {
  width: 20px;
  height: 20px;
  background: #ff0;
  border-radius: 50%;
  margin: 0 5px;
  cursor: pointer;
}
.container .card .contentBx .color span:nth-child(2) {
  background: #155eb4;
}
.container .card .contentBx .color span:nth-child(3) {
  background: red;
}
.container .card .contentBx .color span:nth-child(4) {
  background: black;
}

/* Button/ */
.container .card .contentBx button {
  display: inline-block;
  padding: 10px 20px;
  background: #fff;
  border-radius: 4px;
  margin-top: 10px;
  text-decoration: none;
  font-weight: 600;
  color: #111;
  opacity: 0;
  transform: translateY(50px);
  transition: 0.5s;
  border: none;
}
.container .card:hover .contentBx button {
  opacity: 1;
  transform: translateY(0px);
  transform-delay: 0.75s;
  cursor: pointer;
}

.info {
  position: absolute;
  top: 1em;
  left: 1em;
  color: #fff;
  cursor: pointer;
  z-index: 300;
}

.text {
  display: none;
  color: #fff;
  padding: 2em;
  z-index: 299;
  position: relative;
  backdrop-filter: blur(20px);
  background-color: rgba(0, 0, 0, 0.2);
  height: 100%;
  text-shadow: 1px 0 0 #000, 0 -1px 0 #000, 0 1px 0 #000, -1px 0 0 #000;
}
.info:hover + .text {
  display: block;
}
</style>
