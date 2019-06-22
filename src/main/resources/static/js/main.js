var submit = function(e){
    e.stopPropagation();

    var name = $.trim($("#name").val());
    var age = $.trim($("#age").val());
    if(name == "" || name == null){
        alert("姓名不能空");
        return;
    }
    if(age == "" || age == null){
        alert("年龄不能空");
        return;
    }
    $.post("sendPost",{name:name, age:age},function(result){
        console.log(result);
        alert(result);
    });
};

$(function(){
    $("#submit").click(submit);
});


