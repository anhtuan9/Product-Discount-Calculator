<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 18/10/2018
  Time: 11:33 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/display_discount">
    <div class="display_discount">
      <h2>display-discount</h2>
      <input type="text" name="Discount_Percent" size="30"  placeholder="Discount Percent" />
      <input type="number" name="ListPrice" size="30" placeholder="List Price" />
      <input type="number" name="DiscountPercent" size="30" placeholder="Discount Percent" />
      <input type="submit" value="Calculate discount"/>
    </div>
  </form>
  </body>
</html>
