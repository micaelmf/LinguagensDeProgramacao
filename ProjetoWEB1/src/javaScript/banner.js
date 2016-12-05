

/*
function slide1(){
    document.getElementById("banner").src = "img/banner9.png";
    setTimeout(slide2,1000);
}

function slide2(){
    document.getElementById("banner").src = "img/banner8.png";
    setTimeout(slide1,1000);
}

var a =  new array('img/banner7.png','img/banner8.png','img/banner9.png');

function slide(){

	document.getElementById("banner").src = a[2];

}
*/
/*
var myImage = document.getElementById("banner");

var imageArray = ["img/imagem7.jpg","img/imagem8.jpg","img/imagem9.jpg"];

var imageIndex = 0; 

function slide1() {
  myImage.setAttribute("src",imageArray[imageIndex]);
  imageIndex = (imageIndex + 1) % imageArray.length;

}

setInterval(slide1, 1000);
*/

/*
var imgArray = ["img/imagem7.jpg","img/imagem8.jpg","img/imagem9.jpg"];

var element = document.getElementById("banner");

function slide1(element)
{
    var img = document.getElementById(element);

    for(var i = 0; i < imgArray.length;i++){
        if(imgArray[i].src == img.src){ // << check this
            if(i === imgArray.length){
                document.getElementById(element).src = imgArray[0].src;
                break;
            }
            document.getElementById(element).src = imgArray[i+1].src;
            break;
        }
    }
}
*/

var imagens = ["img/imagem7.jpg","img/imagem8.jpg","img/imagem9.jpg"];
var indice = 0;

function buildImage() {
  var img = document.createElement('img')
  img.src = imagens[indice];
  document.getElementById('content').appendChild(img);
}

function proxImagem(){
    var img = document.getElementById('content').getElementsByTagName('img')[0]
    indice++;
    indice = indice % imagens.length 
    img.src = imagens[indice];
}

function imagemAnt(){
    var img = document.getElementById('content').getElementsByTagName('img')[0]
    if(indice == 0){
        indice = imagens.length-1;
        img.src = imagens[indice];	
    }else{
        indice--;
        img.src = imagens[indice];
    }
}

setInterval(proxImagem, 5000);