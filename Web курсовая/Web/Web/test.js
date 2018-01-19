let canvas = document.getElementById("canvas");
let ctx = canvas.getContext("2d");
var image = new Image();
var image2 = new Image();
image.onload = function () {
    setInterval(move,1);
};
image2.onload = function () {
    setInterval(move2,1);
};
var x =1;
var mark  = true;
var n =1;
var angle=Math.PI/180;
var x2 =700;
var mark2  = false;
var n2 =1;
var angle2=Math.PI/180;
function move() {
    if(x<700 && mark){
        x+=1;
        if(x>=700) mark=false;
    }
    if(x<=700 && !mark)
    {
        x-=1;
        if(x==0) mark=true;
    }
    ctx.clearRect(0,0, canvas.width, 300);
    ctx.save();
    ctx.translate(x+50,10+72);
    ctx.rotate(angle*n);
    ++n;
    ctx.drawImage(image,-50,-72,100,115);
    ctx.restore();
}

function move2() {
    if(x2<700 && mark2){
        x2+=1;
        if(x2==700) mark2=false;
    }
    if(x2<=700 && !mark2)
    {
        x2-=1;
        if(x2==0) mark2=true;
    }
    ctx.clearRect(0,300, canvas.width, 300);
    ctx.save();
    ctx.translate(x2+50,370+72);
    ctx.rotate(angle2*n);
    ++n2;
    ctx.drawImage(image2,-50,-72,100,115);
    ctx.restore();
}
image.src = "images/dino.png";
image2.src = "images/dino2.png";