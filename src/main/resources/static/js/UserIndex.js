
function getJson(){
    //页面加载完成之后执行函数
    $(function(){
        console.log("获取Json数据");
       //发送ajax
        $.ajax({
            type:"POST",
            url:"user/login", //直接填写项目的窄化和RequsetMapping地址即可
            dataType:"json",
            success:function (data){
                console.log(data);
            }
        });

    })

}