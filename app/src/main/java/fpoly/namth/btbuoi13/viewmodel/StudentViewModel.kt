package fpoly.namth.btbuoi13.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fpoly.namth.btbuoi13.repository.Repository
import fpoly.namth.btbuoi13.room.StudentEntity
import kotlinx.coroutines.launch

class StudentViewModel(val repository: Repository): ViewModel() {

    fun addStudent(student: StudentEntity) {
        viewModelScope.launch {
            repository.addStudentToRoom(student)
        }
    }

    val students = repository.getAllStudents()

    fun deleteStudent(student: StudentEntity) {
        viewModelScope.launch {
            repository.deleteStudentFromRoom(student)
        }
    }

    fun updateStudent(student: StudentEntity) {
        viewModelScope.launch {
            repository.updateStudent(student)
        }
    }
}