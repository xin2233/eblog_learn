<#include "inc/layout.ftl"/>
<@layout "首页">
    <div class="layui-container">
        <div class="layui-row layui-col-space15">
            <#--            <#include "inc/left.ftl" >-->
            <#--index left-->
            <div class="layui-col-md8">
                <div class="fly-panel">
                    <div class="fly-panel-title fly-filter">
                        <a>置顶</a>
                        <a href="#signin" class="layui-hide-sm layui-show-xs-block fly-right" id="LAY_goSignin"
                           style="color: #FF5722;">去签到</a>
                    </div>
                    <ul class="fly-list">
<#--                    post 的标签是模板，在PostTemplate.java中定义-->
<#--                    result 是java返回的数据-->
<#--                        pn=1,默认，所以没写，-->
<#--                        size=3：显示3条，-->
<#--                        level=1：选中置顶的，-->
                        <@posts size=3 level=1>
                            <#list results.records as post>
                                <@plisting post></@plisting>
                            </#list>
                        </@posts>
                    </ul>
                </div>

                <div class="fly-panel" style="margin-bottom: 0;">

                    <div class="fly-panel-title fly-filter">
                        <a href="" class="layui-this">综合</a>
                        <span class="fly-mid"></span>
                        <a href="">未结</a>
                        <span class="fly-mid"></span>
                        <a href="">已结</a>
                        <span class="fly-mid"></span>
                        <a href="">精华</a>
                        <span class="fly-filter-right layui-hide-xs">
                        <a href="" class="layui-this">按最新</a>
                        <span class="fly-mid"></span>
                            <a href="">按热议</a>
                        </span>
                    </div>

                    <ul class="fly-list">
                        <!--indexController中setAttribute的属性，数据结构就是IPage的class-->
                        <#list pageData.records as post>
                            <@plisting post></@plisting>
                        </#list>
                    </ul>

                    <#--分页-->
                    <@paging pageData></@paging>

                </div>
            </div>
            <#include "inc/right.ftl" >
        </div>
    </div>

</@layout>