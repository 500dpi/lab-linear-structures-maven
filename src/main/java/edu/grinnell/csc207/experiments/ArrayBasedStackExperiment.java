package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.linear.ArrayBasedStack;

/**
 * A really simple experiment with ArrayBasedStacks.
 *
 * @author Samuel A. Rebelsky
 * @author Sara Jaljaa
 */
public class ArrayBasedStackExperiment {
  /**
   * Do all the work. (Well, make the helpers do all the work.)
   */
  public static void main(String[] args) throws Exception {
    LinearStructureExperiment.expt01(new ArrayBasedStack<String>(16), "size16.");
    LinearStructureExperiment.expt01(new ArrayBasedStack<String>(4), "size04.");
  } // main(String[])
} // class ArrayBasedStackExperiment
