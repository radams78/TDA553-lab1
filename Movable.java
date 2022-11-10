interface Movable {
    
    int[][] directionList = {{0,1},{1,0},{0,-1},{-1,0}};
    int index = 0;

  

    void turnLeft(){
        index -= 1
        if (index < 0){
            index = 3
        }
    }
    
    void turnRight(){
        index += 1
        if (index > 3){
            index = 0
        }
    }

    void move(){
        x += currentSpeed * directionList[index][0];
        y += currentSpeed * directionList[index][1];
    }
}
