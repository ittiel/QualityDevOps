package com.example.findbugs;

/**
 * Troubling Rank Bugs Sample.
 */
public class TroublingRankBugs {

    /**
     * Empty synchronized.
     */
    private void emptySynchronized() {
        synchronized (this) {
            // Forgot implementation
        }
    }

    /**
     * Sleep in synchronized.
     *
     * @throws InterruptedException the interrupted exception
     */
    private void sleepInSynchronized() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(5000);
        }
    }
}