 <#--分页-->
<#macro paging pageData>
<div style="text-align: center">
    <div id="laypage-main">

    </div>
    <script>
        layui.use("laypage", function () {
            var laypage = layui.laypage;
            // 执行一个laypage 实例
            laypage.render({
                elem: 'laypage-main', // 这里是ID 不用加 #，
                count: ${pageData.total},  // 总数，从服务器获得
                limit: ${pageData.size},  //
                curr: ${pageData.current},  //
                jump: function (obj, first) {
                    // obj 中包含了分页的所有参数
                    // console.log(obj.curr); // 得到当前页
                    // console.log(obj.limit);  // 得到每页显示的条数

                    // 首次不执行
                    if (!first){
                        // do something
                        location.href = "?pn=" + obj.curr;
                    }
                }
            });
        });
    </script>
</div>
</#macro>
