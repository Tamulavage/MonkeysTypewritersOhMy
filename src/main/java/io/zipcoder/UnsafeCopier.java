package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {

        while (super.stringIterator.hasNext()) {
            try {
                Thread.sleep(10000);
            } catch(InterruptedException e) {
                System.out.println("unsafe INTERRUPTED");
            }
            super.copied = super.copied + " " + super.stringIterator.next();

        }



    }

}
