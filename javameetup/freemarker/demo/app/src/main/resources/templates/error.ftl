<#import "layout/bootstrap-layout.ftl" as layout>

<@layout.page>
    <div class="p-1"></div>
    <div class="alert alert-danger">
        <strong>An error has occured - please contact the developers with the information below ...</strong>
    </div>
    <table class="table table-striped">
        <#if path??>
            <tr>
                <td style="width:20%">Path</td>
                <td style="width:80%">${path}</td>
            </tr>
        </#if>
        <#if RequestParameters?has_content>
            <tr>
                <td>Parameters</td>
                <td>
                    <#list RequestParameters as name, value>
                        ${name}=${value}&nbsp;
                    </#list>
                </td>
            </tr>
        </#if>
        <#if status??>
            <tr>
                <td>Error</td>
                <td>${status!""} ${error!""}</td>
            </tr>
        </#if>
        <#if timestamp??>
            <tr>
                <td>Timestamp</td>
                <td>${timestamp?datetime?iso_utc}</td>
            </tr>
        </#if>
        <#if message??>
            <tr>
                <td>Message</td>
                <td>${message}</td>
            </tr>
        </#if>
        <#if trace??>
            <tr>
                <td>Stack Trace</td>
                <td><small>${trace}</small></td>
            </tr>
        </#if>
    </table>
</@layout.page>