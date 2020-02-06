class Stack{
        private int[] stack;
        private int top,size;

        Stack(int n){
                stack = new int[n];
                top = -1;
                size = n;
        }

        void push(int a){
                if(top + 1 < size) stack[++top] = a;
        }

        int pop(){
                return stack[top--];
        }

        void print(){
                int p = top;
                while(p >= 0){
                        System.out.println(stack[p--]);
                }
        }

        public static void main(String args[]){
                Stack S = new Stack(30);
                S.push(10);
                S.push(20);
                S.push(30);
                S.push(15);
                S.push(9);
                S.print();
                System.out.println("Element popped = " + S.pop());
                System.out.println("Element popped = " + S.pop());
                System.out.println("Element popped = " + S.pop());
                S.print();
        }
}
