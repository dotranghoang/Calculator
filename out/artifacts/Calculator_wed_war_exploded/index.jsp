<%--
  Created by IntelliJ IDEA.
  User: Do Trang Hoang PC
  Date: 19/09/2019
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form method="post" action="/calculator">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>First Operand: </td>
          <td><input name="first-operand" type="number"></td>
        </tr>
        <tr>
          <td>Operator:</td>
          <td>
            <select name="operator">
              <option value="+">Addition(+)</option>
              <option value="-">Subtraction(-)</option>
              <option value="*">Multiplication(x)</option>
              <option value="/">Division(/)</option>
            </select>
          </td>
        </tr>
        <tr>
          <td>Second Operand: </td>
          <td><input type="number" name="second-operand"> </td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Calculator"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
