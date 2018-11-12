package example.FirstTwoClasses;

public class Clock {
        private Display hour = new Display(24);
        private Display minute = new Display( 24);
        public void tick(){
            minute.tick();
            if(minute.getValue() ==0){
                hour.tick();
            }
        }
        public void  show(){
            System.out.printf(hour.getValue()+":"+minute.getValue());
        }
        public static void main(String[] args) {
            Clock c = new Clock();
            while (true){
                c.tick();
                c.show();
            }

        }
}
