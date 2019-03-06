<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
        <title>SGP - App</title>
        <style>
          body{
            padding-left: 15px;
          }
        </style>
    </head>
    <body>
        <h1>Nouveau collaborateur</h1>
        <form class="form-horizontal" method="POST">
            <fieldset>
            
            <!-- Form Name -->
            <legend>Ajouter une nouveau collaborateur</legend>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="nom">nom</label>  
              <div class="col-md-4">
              <input id="nom" name="nom" type="text" placeholder="" class="form-control input-md" required="">
                
              </div>
            </div>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="prenom">Prénom</label>  
              <div class="col-md-4">
              <input id="prenom" name="prenom" type="text" placeholder="" class="form-control input-md" required="">
                
              </div>
            </div>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="dateNaissance">Date de naissance</label>  
              <div class="col-md-4">
              <input id="dateNaissance" name="dateNaissance" type="date" placeholder="" class="form-control input-md" required="" 
              min="1920-01-01" max="2019-12-31">
                
              </div>
            </div>
            
            <!-- Textarea -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="adresse">Adresse</label>
              <div class="col-md-4">                     
                <textarea class="form-control" id="adresse" name="adresse" required></textarea>
              </div>
            </div>
            
            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="numSecurite">Numéro de sécurité Sociale</label>  
              <div class="col-md-4">
              <input id="numeroSecurite" name="numSecurite" type="number" placeholder="" class="form-control input-md" required="">
                
              </div>
            </div>
            
            <!-- Button -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="valider"></label>
              <div class="col-md-4">
                <button id="valider" name="valider" class="btn btn-primary">Valider</button>
              </div>
            </div>
            
            </fieldset>
            </form>
            
    </body>
</html>