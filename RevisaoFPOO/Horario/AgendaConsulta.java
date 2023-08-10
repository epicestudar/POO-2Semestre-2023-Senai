package RevisaoFPOO.Horario;

public class AgendaConsulta {
  String agendamento;
  String horario;
  String dia;
  String cliente;
  String veterinario;
public String getAgendamento() {
    agendamento = horario + dia;
    return agendamento;
}
public String getHorario() {
    return horario;
}
public void setHorario(String horario) {
    this.horario = horario;
}
public String getDia() {
    return dia;
}
public void setDia(String dia) {
    this.dia = dia;
}
public String getCliente() {
    return cliente;
}
public void setCliente(String cliente) {
    this.cliente = cliente;
}
public String getVeterinario() {
    return veterinario;
}
public void setVeterinario(String veterinario) {
    this.veterinario = veterinario;
}

  
}
