
public class MSWORD {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1.setName("TYPING");
        d2.setName("SPELLCHECK");
        d3.setName("AUTOSAVE");

        d2.setDaemon(true);
        d3.setDaemon(true);

        d2.setPriority(8);
        d3.setPriority(7);
        d1.start();
        d2.start();
        d3.start();


        
    }
}

class Demo extends Thread {
    public void run(){
        if(this.getName() == "TYPING"){
            this.Typing();
        }
        else if(this.getName() == "SPELLCHECK")
        {
            this.SpellChecking();
        }
        else{
            this.AutoSaving();
        }
    }

    void Typing() {
        try {
            System.out.println("Started Typing");
            for (int i = 0; i < 5; i++) {
                System.out.println("Still typing...");
                Thread.sleep(3000);
            }
            System.out.println("Typing ended");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void SpellChecking() {
        try {
            System.out.println("Started Spell Check");
            for (;;) {
                System.out.println("Still Spell Check...");
                Thread.sleep(3000);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void AutoSaving() {
        try {
            System.out.println("Started Auto Save");
            for (;;) {
                System.out.println("Still Auto Save...");
                Thread.sleep(3000);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}