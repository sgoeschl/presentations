<#import "layout/bootstrap-layout.ftl" as layout>
<#import "/spring.ftl" as spring/>

<@layout.page>
    <h2>Create an new user</h2>
    <fieldset>
        <form name="user-form" action="" method="POST">
            <div class="form-group">
                <label>User Id</label>
                <@spring.formInput path="user.id" fieldType="text" attributes="class='form-control'" />
            </div>
            <div class="form-group">
                <label>User Name</label>
                <@spring.formInput path="user.name" fieldType="text" attributes="class='form-control'" />
            </div>
            <div class="form-group">
                <label>User Group</label>
                <@spring.formSingleSelect path="user.group" options=groups attributes="class='form-control'"/>
            </div>
            <button type="submit" class="btn btn-primary">Create User</button>
        </form>
    </fieldset>
</@layout.page>