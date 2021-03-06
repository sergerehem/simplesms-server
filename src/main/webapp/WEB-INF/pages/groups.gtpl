<% include '/WEB-INF/includes/header.gtpl' %>
 
<% include '/WEB-INF/includes/navbar.gtpl' %>

<div class="container">
  <div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">Groups <small>listar</small></h1>

      <a href="/group/add">Incluir Grupo</a>
      <br><br>
      <div class="table-responsive">
        <table class="table table-striped">
          <thead>
             <tr>
                <th>Nome</th>
                <th>Descrição</th>
                <th>&nbsp;</th>
             </tr>
          </thead>
          <tbody>
             <% request.groups.each { group -> %>
                <tr>
                   <td>${group.name}</td>
                   <td>${group.description}</td>
                   <td><a href="/group/delete/${group.key.id}">Delete</a> | <a href="/group/edit/${group.key.id}">Edit</a></td>
                </tr>
             <% } %>
          </tbody>
        </table>
      </div>
       
    </div>      
  </div><!-- /.row -->
</div><!-- /.container -->

<% include '/WEB-INF/includes/footer.gtpl' %>


