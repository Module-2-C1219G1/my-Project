public class MoveablePoint extends Point {
    public float xSpeed = 0;
    public float ySpeed = 0;

    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return '"'+"("+this.x+","+this.y+")"+",speed=("+this.xSpeed+","+this.ySpeed+")"+'"';
    }
    public void move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        setXY(this.x,this.y);
    }
}
