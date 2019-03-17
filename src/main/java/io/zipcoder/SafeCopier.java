package io.zipcoder;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier{

    private ReentrantLock lock;

    public SafeCopier(String toCopy , ReentrantLock lock) {
        super(toCopy);
        this.lock = lock;
    }


    public void run() {
        lock.lock();

        while (super.stringIterator.hasNext()) {

            super.copied = super.copied + " " + super.stringIterator.next();
        }

        lock.unlock();

    }

}
