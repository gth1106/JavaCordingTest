<html>
<head>

    <title>Calculator</title>
    <script>
        function calc() {

            var x = document.getElementById("x").value;

            var y = document.getElementById("y").value;
            var sum;

            sum = parseInt(x) + parseInt(y);
            document.getElementById("sum").value = sum;
            // 출력하는 장소를 복잡하게 정의 한 것뿐.
        } 
    </script>
</head>

<body> 
        <h3>덧셈 계산기</h3>    

        <form name="myform" action="..." method="POST">
        첫번째 정수:
        <input id="x" /><br/>
        두번째 정수:        
        <input id="y" /><br />
        합계:         
        <input id="sum" /><br />
        <input type="button" value="계산" onclick="calc();" />
    </form>
   


        
</body>
</html>

