function slide1(){
    document.getElementById("banner").src = "img/banner9.png";
    setTimeout(slide2,3000);
}

function slide2(){
    document.getElementById("banner").src = "img/banner8.png";
    setTimeout(slide1,3000);
}

