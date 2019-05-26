<div>
    <#if errorMessage??>
        <div class="alert alert-danger">
            <strong>${errorMessage}</strong>
        </div>
    </#if>
    <#if successMessage??>
        <div class="alert alert-success">
            <strong>${successMessage}</strong>
        </div>
    </#if>
</div>