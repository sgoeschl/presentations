<#import "layout/bootstrap-layout.ftl" as layout>
<#import "/spring.ftl" as spring/>

<@layout.page>
    <h2>User Details</h2>
    <table class="table table-striped">
        <tr>
            <td style="width:20%">User Id</td>
            <td style="width:80%">${user.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>Group</td>
            <td>${user.group}</td>
        </tr>
    </table>
</@layout.page>