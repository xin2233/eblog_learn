<#-- Layout -->
<#macro layout title>
    <!DOCTYPE html>
    <html lang="zh-CN">
    <head>
        <meta charset="utf-8">
        <meta >
        <!--[if IE]>
        <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'/>
        <![endif]-->
        <title>${title?default('java思维导图')}</title>
    </head>
    <body>
    <#nested>
    </body>
    </html>
</#macro>