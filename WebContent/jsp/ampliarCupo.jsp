<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  header.jsp -->
<%@ include file="../template/header.jsp" %>

    <form action="/ExamenPESRaquelOrtega/Banco/ampliarCupo" method="post" enctype="text/html"> 
  <fieldset>
  <legend style="font-size: 1.3em">AMPLIAR CUPO</legend>
  
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
      <label for="cupoMaximo">NUEVO CUPO MAXIMO</label>
    </div>
    <div class="cuadro">
      <input type="text" name="cupoMaximo" id="cupoMaximo" />
    </div>
    
    <div class="texto">
      <label>SALDO DISPONIBLE</label>
    </div>
    <div class="cuadro">
      <input type="text"  id="saldoDisponible" name="saldoDisponible" />
    </div>
    
    
    <div class="texto">
      <label>NUMERO DE COMPROBACION</label>
    </div>
    <div class="cuadro">
      <input type="text"  id="numComprobacion" name="numComprobacion" />
    </div>   
    
    <div class="texto">
      <label>CONTRASEÑA</label>
    </div>
    <div class="cuadro">
      <input type="password"  id="contrasenha" name="contrasenha" />
    </div> 
      
    
    </fieldset>
    
    <div class="texto">
     <input type="submit" name="enviar" id="enviar" value="Enviar" /> 
     <input type="reset" name="reiniciar" id="reiniciar" value="Reiniciar" />
    </div>
    
  </form>
  <!--  footer.jsp -->
<%@ include file="../template/footer.jsp" %>