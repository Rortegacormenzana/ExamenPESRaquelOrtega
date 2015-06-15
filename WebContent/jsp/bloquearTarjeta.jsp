<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  header.jsp -->
<%@ include file="../template/header.jsp" %>

    <form action="/ExamenPESRaquelOrtega/Banco/bloquearTarjeta" method="post" enctype="text/html"> 
  <fieldset>
  <legend style="font-size: 1.3em">BLOQUEAR TARJETA</legend>
  
    <div class="cuadro">
      <input type="hidden"  id="id" name="id" />
    </div>
    
    <div class="texto">
      <label for="nombre">NUMERO TARJETA</label>
    </div>
    <div class="cuadro">
      <input type="text" name="numero" id="numero"  />
    </div>
    
    <div class="texto">
      <label>BLOQUEADA</label>
    </div>
    
    <div class="check">
     <label for="bloqueada" >Seleccione: </label>
    <select name="bloqueada" id="bloqueada">
        <option value="si">SI</option> 
        <option value="no">NO</option> 
    </select>
    </div>    
    
    </fieldset>
    
    <div class="texto">
     <input type="submit" name="enviar" id="enviar" value="Enviar" /> 
     <input type="reset" name="reiniciar" id="reiniciar" value="Reiniciar" />
    </div>
    
  </form>
  <!--  footer.jsp -->
<%@ include file="../template/footer.jsp" %>