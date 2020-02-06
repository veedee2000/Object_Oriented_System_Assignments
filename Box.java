 
class Box{
        private int height,width,breadth;

        Box(int h,int w,int b){
                height = h;
                width = w;
                breadth = b;
        }

        int getArea(){
                int a = 2 * height * width;
                int b = 2 * height * breadth;
                int c = 2 * width * breadth;
                return a + b + c;
        }

        int getVolume(){
                return height * width * breadth;
        }

        public static void main(String args[]){
                Box B1 = new Box(2,54,3);
                Box B2 = new Box(7,7,7);
                System.out.println("Area of Box1 = " + B1.getArea());
                System.out.println("Area of Box2 = " + B2.getArea());
                System.out.println("Volume of Box1 = " + B1.getVolume());
                System.out.println("Volume of Box2 = " + B2.getVolume());
        }
}
