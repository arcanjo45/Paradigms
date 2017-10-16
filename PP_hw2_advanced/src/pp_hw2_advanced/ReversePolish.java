/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_hw2_advanced;

import java.util.Stack;

/**
 *
 * @author Acer
 */
public class ReversePolish {
    
     public int evaluation(String[] exp) {
         Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < exp.length; i++)
        {
            if (exp[i].matches("-?[\\d]+"))
            {
                stack.push(Integer.parseInt(exp[i]));
            }
            else
            {
                int op2 = stack.pop();
                int op1 = stack.pop();
                int result = 0;
                String operator = exp[i];
                
                switch(operator)
                {
                    case "+": result = op1+op2; break;
                    case "-": result = op1-op2; break;
                    case "*": result = op1*op2; break;
                    case "/": result = op1/op2; break;
                    default: break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
    
}
