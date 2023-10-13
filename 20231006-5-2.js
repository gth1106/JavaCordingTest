$(document).ready(function(){
    $("#A1").attr("src", "http://www.rskv.co.kr/7_DB/7_k28/20231006/img/7_K28.jpg");
    $("#B1").on({
        click : function () {
            $("img").css({width:"180", height : "185"});
        }
    });
    $("img").on({
        click : function(){
            $("#A1").attr("src", "http://www.rskv.co.kr/7_DB/7_k28/20231006/img/7_K28.png");
            $("img").css({width:"300", height : "305"});
        }
    });
    $("img").on({
        dblclick : function(){ // double click
            $(location).attr("href", "http://www.rskv.co.kr:8090/ncs");
        }
    });
});