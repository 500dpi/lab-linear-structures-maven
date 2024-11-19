package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.StringUtils;

/**
 * Experiments with matching parentheses and other such things.
 *
 * @author Samuel A. Rebelsky
 * @author Sara Jaljaa
 */
public class MatchingExperiments {
  // +---------+-----------------------------------------------------
  // | Helpers |
  // +---------+

  /**
   * A single experiment with checkMatching.
   */
  static void checkMatchingExperiment(PrintWriter pen, String str) {
    pen.print("checkMatching(\"" + str + "\") = ");
    pen.flush();
    try {
      pen.println(StringUtils.checkMatching(str));
    } catch (Exception e) {
      pen.println("*** ERROR *** " + e.toString());
    } // try/catch
  } // checkMatchingExperiment(PrintWriter, String)

  /**
   * A quick set of experiments with checkMatching.
   */
  static void checkMatchingExperiments(PrintWriter pen) {
    checkMatchingExperiment(pen, "");
    checkMatchingExperiment(pen, "()");
    checkMatchingExperiment(pen, "(");
    checkMatchingExperiment(pen, ")");
    checkMatchingExperiment(pen, "[]()");
    checkMatchingExperiment(pen, "[()([])]");
    checkMatchingExperiment(pen, "[a(b]c)");
    checkMatchingExperiment(pen, "Hello (there) (world (!!))");
    checkMatchingExperiment(pen, "alphabetical");
    checkMatchingExperiment(pen, "((((((((a))))))))");
    checkMatchingExperiment(pen, "((((((((a)))))]))");
    checkMatchingExperiment(pen, "(([((((((a)))))]))");
    checkMatchingExperiment(pen, "(([((((((a))))))])");
    checkMatchingExperiment(pen, "((((b)(((((a)(c)))(d))))))");
    // Feel free to add your own
  } // checkMatchingExperiments()

  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Run a few experiments.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    checkMatchingExperiments(pen);
    pen.close();
  } // main(String[])
} // class MatchingExperiments
