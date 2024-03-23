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

<#-- post list-->
<#macro plisting post>
    <li>
        <a href="/user/${post.authorId}" class="fly-avatar">
            <img src="${post.authorAvatar}" alt="${post.authorName}">
        </a>
        <h2>
            <a class="layui-badge">${post.categoryName}</a>
<#--            根据PostControll.java 中的mapping来填路径-->
            <a href="/post/${post.id}">${post.title}</a>
        </h2>
        <div class="fly-list-info">
            <a href="/user/${post.authorId}" link>
                <cite>${post.authorName}</cite>
                <!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
            </a>
            <#--这个是文章的时间-->
            <#--                                <span>${post.created?string('yyyy.MM.dd_HH:mm:ss')}</span>-->
            <span>${timeAgo(post.created)}</span>

            <#--                                <span class="fly-list-kiss layui-hide-xs" title="悬赏飞吻"><i-->
            <#--                                            class="iconfont icon-kiss"></i> 60</span>-->
            <!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
            <span class="fly-list-nums">
                                    <i class="iconfont icon-pinglun1" title="回答"></i> ${post.commentCount}
                                </span>
        </div>
        <div class="fly-list-badge">
            <#if post.recommend><span class="layui-badge layui-bg-red">精帖</span></#if>
            <#if post.level gt 0><span class="layui-badge layui-bg-black">置顶</span></#if>
        </div>
    </li>
</#macro>

