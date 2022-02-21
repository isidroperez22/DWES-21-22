package org.iesalixar.servidor.model;

import java.io.Serializable;
import java.util.Objects;

public class AlumnoAsignaturaId implements Serializable {

		private Long alumno;
		private Long asignatura;
		
		public AlumnoAsignaturaId() {
			// TODO Auto-generated constructor stub
		}

		public Long getAlumno() {
			return alumno;
		}

		public void setAlumno(Long alumno) {
			this.alumno = alumno;
		}

		public Long getAsignatura() {
			return asignatura;
		}

		public void setAsignatura(Long asignatura) {
			this.asignatura = asignatura;
		}

		@Override
		public int hashCode() {
			return Objects.hash(alumno, asignatura);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AlumnoAsignaturaId other = (AlumnoAsignaturaId) obj;
			return Objects.equals(alumno, other.alumno) && Objects.equals(asignatura, other.asignatura);
		}		
		
}
