 
class Student{

        String name;
        int[] marks;
        int total;

        Student(){}

        void getName(String n){
                name = n;
        }

        void getMarks(int[] a){
                marks = new int[3];
                for(int i = 0;i < 3;i++){
                        marks[i] = a[i];
                        total += a[i];
                }
        }

        double avg(){
                return (double) total / 3;
        }

        void disp(){
                System.out.println("Name : " + name);
                System.out.println("Total Marks = " + total);
                System.out.println("Average = " + this.avg());
        }

        public static void main(String args[]){
                Student Student1 = new Student();
                Student1.getName("Varun");
                int[] arr = {66,74,68};
                Student1.getMarks(arr);
                Student1.disp();
        }


}
