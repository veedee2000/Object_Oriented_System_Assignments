 
class Room{
        private int height,width,breadth;
        Room(int h,int w,int b){
                height = h;
                width = w;
                breadth = b;
        }
        int Volume(){
                return height * width * breadth;
        }
}

class RoomDemo{
        public static void main(String args[]){
                Room Room1 = new Room(11,23,2);
                System.out.println("Volume = " + Room1.Volume());
        }

}
~          
