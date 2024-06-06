package fpoly.namth.btbuoi13.repository

import fpoly.namth.btbuoi13.room.StudentEntity
import fpoly.namth.btbuoi13.room.StudentsDB

class Repository(val studentsDB: StudentsDB) {
    suspend fun addStudentToRoom(studentEntity: StudentEntity){
        studentsDB.studentDao().addStudent(studentEntity)
    }

    fun getAllStudents() = studentsDB.studentDao().getALlStudents()

    suspend fun deleteStudentFromRoom(studentEntity: StudentEntity) {
        studentsDB.studentDao().deleteStudent(studentEntity)
    }

    suspend fun updateStudent(studentEntity: StudentEntity){
        studentsDB.studentDao().updateStudent(studentEntity)
    }
}