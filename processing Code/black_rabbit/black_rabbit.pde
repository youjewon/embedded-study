
size(500, 1000);
background(255);
stroke(147);
strokeWeight(3);
// ear
fill(0);
ellipse(170, 150, 100, 270);
ellipse(330, 150, 100, 270);


fill(#ED88C3);
ellipse(170, 150, 80, 240);
ellipse(330, 150, 80, 240);


// body & face
fill(0);
ellipse(250, 600, 250, 600);

quad(150, 450, 200, 480, 200, 600, 150, 600);
quad(350, 450, 300, 480, 300, 600, 350, 600);

ellipse(250, 350, 300, 300);
// eyes
fill(255);
noStroke();
ellipse(180, 340, 80, 80);
ellipse(320, 340, 80, 80);
fill(0);
ellipse(180, 340, 70, 70);
ellipse(320, 340, 70, 70);

// nose
fill(147);
ellipse(250, 380, 40, 10);
stroke(147);
arc(250, 400, 0, 30, radians(90), radians(270));
noFill();
arc(225, 415, 50, 20, radians(0), radians(180));
arc(275, 415, 50, 20, radians(0), radians(180));

fill(0);
arc(200, 800, 230, 230, radians(60), radians(235));
arc(330, 800, 230, 230, radians(290), radians(482));

arc(175,600,50,50,radians(0),radians(180));
arc(325,600,50,50,radians(0),radians(180));
ellipse(150,900,200,30);
ellipse(370,900,200,30);
