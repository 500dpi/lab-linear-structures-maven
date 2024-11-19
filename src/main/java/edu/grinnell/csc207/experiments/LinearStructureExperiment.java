package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.linear.LinearStructure;
import edu.grinnell.csc207.linear.ReportingLinearStructure;

import java.io.PrintWriter;
import java.util.Iterator;

/**
 * Experiments with LinearStructures.
 *
 * @author Samuel A. Rebelsky
 * @author Sara Jaljaa
 */
public class LinearStructureExperiment {
  // +----------------+--------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * A series of experiments on a structure of strings.
   */
  public static void expt01(LinearStructure<String> ls, String prefix) throws Exception {
    ReportingLinearStructure<String> expt = new ReportingLinearStructure<String>(ls, prefix);
    expt.info();
    expt.put("a");
    expt.info();
    expt.put("b");
    expt.info();
    expt.put("c");
    expt.info();
    expt.get();
    expt.info();
    expt.put("d");
    expt.info();
    expt.get();
    expt.get();
    expt.info();
    expt.put("e");
    expt.info();
    expt.clear();
    expt.put("f");
    expt.put("g");
    expt.put("h");
    expt.put("i");
    expt.put("j");
    expt.info();
    expt.clear();
  } // expt01
} // class LSExperiment
