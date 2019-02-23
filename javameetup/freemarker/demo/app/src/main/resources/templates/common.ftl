<#macro navbar>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <a class="navbar-brand" href="/">
            <img src="/logo.png" alt="Logo" style="width:30px;">
        </a>
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/ui/menu/info">Info</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/ui/menu/monitoring">Monitoring</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/ui/menu/tools">Tools</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/ui/menu/links">Links</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/actuator/logfile">Logfile</a>
            </li>
        </ul>
    </nav>
    <br>
</#macro>

<#macro head>
    <head>
        <title>Spring Boot FreeMarker Demo</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    </head>
</#macro>

<#macro errorMessages>
    <#if errorMessage??>
        <div class="alert alert-danger">
            <strong>${errorMessage}</strong>
        </div>
    </#if>
</#macro>
