function slide1(){
    document.getElementById("banner_esquerda").src = "img/banner1.png";
    setTimeout(slide2,1000);
}

function slide2(){
    document.getElementById("banner_esquerda").src = "img/banner2.png";
    setTimeout(slide1,1000);
}

