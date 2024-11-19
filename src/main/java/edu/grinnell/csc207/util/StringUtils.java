package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Sara Jaljaa
 */
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) throws Exception {
    Stack<Character> parens = new LinkedStack<Character>();
    char[] chars = str.toCharArray();
    char matching;
    int count = 0;

    /* Return if there is one or no elements; there
    cannot be a matching pair in these conditions */
    if (str.length() <= 1) {
      return false;
    } // if

    for (int i = 0; i < chars.length; i++) {

      /* Check if there is a starting bracket type ( or [ */
      if (startBrack(chars[i])) {
        parens.push(chars[i]);
      } // if

      /* Check if there is an ending bracket type ) or ] */
      if (endBrack(chars[i])) {
        if (parens.isEmpty()) {
          return false;
        } else {
          switch (chars[i]) {
            /* If the popped starting brace matches the ending brace ) or ], there
            is a pair; increase the count to indicate there are brackets present */
            case ')':
              matching = parens.get();
              if (pairs(matching, '(')) {
                return false;
              } // if
              count++;
              break;
            case ']':
              matching = parens.get();
              if (pairs(matching, '[')) {
                return false;
              } // if
              count++;
              break;
            default:
              break;
          } // switch
        } // elif
      } // if
    } // for
    /* If the stack is not empty, all pairs were not matched. If the count
    is greater than zero, then there were braces in the stack (as opposed to
    just non-brace characters) */
    if (!parens.isEmpty()) {
      return false;
    } else {
      return (count > 0);
    } // elif
  } // checkMatching

  private static boolean pairs(char matching, char target) {
    return (matching != target);
  } // pairs(char, char)

  private static boolean startBrack(char brack) {
    return (brack == '(' || brack == '[');
  } // startBrack(char)

  private static boolean endBrack(char brack) {
    return (brack == ')' || brack == ']');
  } // endBrack(char)
} // class StringUtils

