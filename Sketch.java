import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  

  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
   int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 60; intRow++) {
      strokeWeight(5);
      intY = 300 + (5 * intRow);
      if(intRow % 4 == 0){
        stroke(255, 255, 255);
      }
      else if (intRow % 2 == 0){
        stroke(255, 255, 255);
      }
      else if (intRow % 2 == 1){
        stroke(45, 150, 207);
      }
      line(0, intY, 300, intY);
    }

    for(int intColumn = 0; intColumn < 30; intColumn++){
      stroke(45, 150, 207);
      intX = 600 + (10 * intColumn);
      line(intX, 300, intX, 600);
    }
    
    for(int intBlueRows = 0; intBlueRows < 60; intBlueRows++){
      stroke(45, 150, 207);
      intY = 300 * (5 + intBlueRows);
      line(0, intY, 300, intY);
    }
  }
    
  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for (int intColumn = 0; intColumn < 60; intColumn++){
      strokeWeight(5);
      intX = 300 + (5 * intColumn);
      if(intColumn % 4 == 0){
        stroke(0, 0, 0);
      }
      else if (intColumn % 2 == 0){
        stroke(255, 255, 255);
      }
      else if( intColumn % 2 == 1){
        stroke(45, 150, 207);
      }
      line(intX, 300, intX, 600);
    }
    for(int intRow = 0; intRow < 30; intRow++){
      stroke(45, 150, 207);
      intY = 300 + (10 * intRow);
      line(300, intY, 600, intY);

    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 60; intRow++) {
      strokeWeight(5);
      intY = 300 + (5 * intRow);
      if(intRow % 4 == 0){
        stroke(0, 0, 0);
      }
      else if (intRow % 2 == 0){
        stroke(255, 255, 255);
      }
      else if (intRow % 2 == 1){
        stroke(45, 150, 207);
      }
      line(600, intY, 900, intY);
    }

    for(int intColumn = 0; intColumn < 30; intColumn++){
      stroke(45, 150, 207);
      intX = 600 + (10 * intColumn);
      line(intX, 300, intX, 600);
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 60; intRow++){
      for(int intColumn = 0; intColumn < 60; intColumn ++){
        strokeWeight(5);
          intY = 300 + (5 * intRow);
          intX = 900 + (5 * intColumn);

          // print out horizontal lines
          if(intRow % 4 == 0){
            stroke(0, 0, 0);
          }
          else if (intRow % 2 == 0){
            noStroke();
          }
          else if(intRow % 2 == 1){
            stroke(45, 150, 207);
          }
          line(900, intY, 1200, intY);

          // print out vertical lines
          if (intColumn % 4 == 0){
            stroke(0, 0, 0);
          }
          else if(intRow % 2 == 0){
            noStroke();
          }
          else if(intColumn % 2 == 1){
            stroke(45, 150, 207);
          }
          line(intX, 300, intX, 600);
      }
    }

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 905 + 10 * intColumn;
        intY = 305 + 10 * intRow;

        stroke(45, 150, 207);
        line(intX, 300, intX, 600);
        line(900, intY, 1200, intY);
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 10 * intRow;
        intY = 10 * intColumn;

        stroke(45, 150, 207);
        strokeWeight(5);
        line(intX, 0, intX, 300);
        line(0, intY, 300, intY);
        line(intX, 0, 0, intY);
      }
    }
  }

  public void draw_section6(){
    

  }

  public void draw_section7(){

  }
  
  public void draw_section8(){
  int intX = 0;
  int intY = 0;

  for(int intRow = 0; intRow < 30; intRow++){
    for(int intColumn = 0; intColumn < 30; intColumn++) {
      intX = 900 + 10 * intRow;
      intY = 10 * intColumn;

      stroke(45, 150, 207);
      strokeWeight(5);
      line(intX, 0, intX, 300);
      line(900, intY, 1200, intY);
      line(intX, 300, 900, intY);
    }
  }
  }

}
