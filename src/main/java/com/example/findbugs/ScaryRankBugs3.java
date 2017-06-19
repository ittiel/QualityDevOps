package com.example.findbugs;

/**
 * Scary Rank Bugs Sample
 */
public class ScaryRankBugs3 {

    /** The check str value. */
    private String checkStrValue = null;

    /**
     * The Constructor.
     */
    public ScaryRankBugs3() {
        this.checkStrValue = "SomeValue";
    }

    /**
     * Execute some conditions.
     */
    private void executeSomeConditions() {
        if ("SomeValue".equals(this.checkStrValue)) {
            // Condition 1
        } else if ("SomeValue".equals(this.checkStrValue)) {
            // Condition 2
        }
    }

    /**
     * Incorrect assignment in if condition.
     */
    public static String incorrectAssignmentInIfCondition(boolean value) {
        String s;
        if (value) {
            //do Something
            s = "true";
        } else {
            //else Do Something
            s = "false";
        }
        return s;
    }
}