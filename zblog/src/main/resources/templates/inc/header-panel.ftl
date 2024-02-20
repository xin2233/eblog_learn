<#--header-panel-->
<div class="fly-panel fly-column">
    <div class="layui-container">
        <ul class="layui-clear">
            <#if currentCategoryId??>
<#--                在indexcontroller 中定义 这个分类的id，0表示是首页-->
            <li class="${(0 == currentCategoryId)?string('layui-hide-xs layui-this','')}"><a href="/">首页</a></li>
<#--            <#if lists?? && lists?size gt 0>-->

            <#list categoryS as item>
                <li class="${(item.id == currentCategoryId)?string('layui-hide-xs layui-this','')}" ><a href="/category/${item.id}">${item.name}</a></li>
            </#list>
            </#if>

<#--            <li><a href="jie/index.html">分享<span class="layui-badge-dot"></span></a></li>-->
<#--            <li><a href="jie/index.html">讨论</a></li>-->
<#--            <li><a href="jie/index.html">建议</a></li>-->
<#--            <li><a href="jie/index.html">公告</a></li>-->
<#--            <li><a href="jie/index.html">动态</a></li>-->
            <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><span class="fly-mid"></span></li>

            <!-- 用户登入后显示 -->
            <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="user/index.html">我发表的贴</a></li>
            <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="user/index.html#collection">我收藏的贴</a>
            </li>
        </ul>

        <div class="fly-column-right layui-hide-xs">
            <span class="fly-search"><i class="layui-icon"></i></span>
            <a href="jie/add.html" class="layui-btn">发表新帖</a>
        </div>
        <div class="layui-hide-sm layui-show-xs-block"
             style="margin-top: -10px; padding-bottom: 10px; text-align: center;">
            <a href="jie/add.html" class="layui-btn">发表新帖</a>
        </div>
    </div>
</div>