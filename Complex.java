class Date{
        private int day,month,year;
        private int arr[] = {"0"}

        Date(){
                day = 1;
                month = 1;
                year = 1970;
        }

        Date(int a){
                day = a;
                month = 1;
                year = 1970;
        }

        Date(int a,int b){
                day = a;
                month = b;
                year = 1970;
        }

        Date(int a,int b,int c){
                day = a;
                month = b;
                year = c;
        }

        void preday(){
                int preday,premonth,preyear = year;
                if(day == 1 && month == 1) preyear = year - 1,preday = 31,premonth = 12;;
                else if(day == 1) preyear = year,preday =
        }
}
 
