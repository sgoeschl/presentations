<#import "layout/bootstrap-layout.ftl" as layout>

<@layout.page>
    <h2>${title}</h2>
    <p>${subtitle}</p>
    <div class="shadow-none p-3 mb-5 bg-light rounded">
        <pre>${body!""}</pre>
    </div>
</@layout.page>
