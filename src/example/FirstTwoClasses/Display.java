package example.FirstTwoClasses;

    public class Display {
        private int uplimit;
        private int value;
        public Display(int uplimit){
            this.uplimit = uplimit;
        }
        public void tick(){
            value ++;
            if( value == uplimit)
                value = 0;
        }
        public int getValue(){
            return value ;
        }
        public static void main(String[] args) {
            Display D = new Display(24);
        }
    }


