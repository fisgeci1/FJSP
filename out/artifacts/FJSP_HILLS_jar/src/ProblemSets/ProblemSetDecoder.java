package ProblemSets;

import Algorithm.Job;
import Algorithm.Operation;

import java.io.*;
import java.util.ArrayList;

public class ProblemSetDecoder {


    public ArrayList<Job> getJobs(int instance) {
        ArrayList<Job> jobs = new ArrayList<>();
        File file = null;
        String basePath = new File("").getAbsolutePath();
        switch (instance) {
            case 0:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\mt10c1.fjs"));
                break;
            case 1:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\mt10cc.fjs"));
                break;
            case 2:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\mt10x.fjs"));
                break;
            case 3:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\mt10xx.fjs"));
                break;
            case 4:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\mt10xxx.fjs"));
                break;
            case 5:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\mt10xy.fjs"));
                break;
            case 6:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\mt10xyz.fjs"));
                break;
            case 7:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\param.dat"));
                break;
            case 8:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\setb4c9.fjs"));
                break;
            case 9:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\setb4cc.fjs"));
                break;
            case 10:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\setb4x.fjs"));
                break;
            case 11:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\setb4xx.fjs"));
                break;
            case 12:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\setb4xxx.fjs"));
                break;
            case 13:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\setb4xy.fjs"));
                break;
            case 14:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\setb4xyz.fjs"));
                break;
            case 15:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\seti5c12.fjs"));
                break;
            case 16:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\seti5cc.fjs"));
                break;
            case 17:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\seti5x.fjs"));
                break;
            case 18:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\seti5xx.fjs"));
                break;
            case 19:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\seti5xxx.fjs"));
                break;
            case 20:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\seti5xy.fjs"));
                break;
            case 21:
                file = new File(basePath.concat("\\src\\ProblemSets\\Barnes\\seti5xyz.fjs"));
                break;
            case 22:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk01.fjs"));
                break;
            case 23:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk02.fjs"));
                break;
            case 24:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk03.fjs"));
                break;
            case 25:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk04.fjs"));
                break;
            case 26:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk05.fjs"));
                break;
            case 27:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk06.fjs"));
                break;
            case 28:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk07.fjs"));
                break;
            case 29:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk08.fjs"));
                break;
            case 30:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk09.fjs"));
                break;
            case 31:
                file = new File(basePath.concat("\\src\\ProblemSets\\Bradimarte\\Mk10.fjs"));
                break;
            case 32:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la01.fjs"));
                break;
            case 33:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la02.fjs"));
                break;
            case 34:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la03.fjs"));
                break;
            case 35:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la04.fjs"));
                break;
            case 36:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la05.fjs"));
                break;
            case 37:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la06.fjs"));
                break;
            case 38:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la07.fjs"));
                break;
            case 39:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la08.fjs"));
                break;
            case 40:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la09.fjs"));
                break;
            case 41:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la10.fjs"));
                break;
            case 42:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la11.fjs"));
                break;
            case 43:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la12.fjs"));
                break;
            case 44:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la13.fjs"));
                break;
            case 45:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la14.fjs"));
                break;
            case 46:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la15.fjs"));
                break;
            case 47:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la16.fjs"));
                break;
            case 48:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la17.fjs"));
                break;
            case 49:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la18.fjs"));
                break;
            case 50:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la19.fjs"));
                break;
            case 51:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la20.fjs"));
                break;
            case 52:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la21.fjs"));
                break;
            case 53:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la22.fjs"));
                break;
            case 54:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la23.fjs"));
                break;
            case 55:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la24.fjs"));
                break;
            case 56:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la25.fjs"));
                break;
            case 57:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la26.fjs"));
                break;
            case 58:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la27.fjs"));
                break;
            case 59:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la28.fjs"));
                break;
            case 60:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la29.fjs"));
                break;
            case 61:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\edata\\la30.fjs"));
                break;
            case 62:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la01.fjs"));
                break;
            case 63:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la02.fjs"));
                break;
            case 64:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la03.fjs"));
                break;
            case 65:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la04.fjs"));
                break;
            case 66:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la05.fjs"));
                break;
            case 67:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la06.fjs"));
                break;
            case 68:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la07.fjs"));
                break;
            case 69:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la08.fjs"));
                break;
            case 70:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la09.fjs"));
                break;
            case 71:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la10.fjs"));
                break;
            case 72:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la11.fjs"));
                break;
            case 73:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la12.fjs"));
                break;
            case 74:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la13.fjs"));
                break;
            case 75:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la14.fjs"));
                break;
            case 76:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la15.fjs"));
                break;
            case 77:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la16.fjs"));
                break;
            case 78:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la17.fjs"));
                break;
            case 79:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la18.fjs"));
                break;
            case 80:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la19.fjs"));
                break;
            case 81:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la20.fjs"));
                break;
            case 82:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la21.fjs"));
                break;
            case 83:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la22.fjs"));
                break;
            case 84:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la23.fjs"));
                break;
            case 85:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la24.fjs"));
                break;
            case 86:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la25.fjs"));
                break;
            case 87:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la26.fjs"));
                break;
            case 88:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la27.fjs"));
                break;
            case 89:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la28.fjs"));
                break;
            case 90:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la29.fjs"));
                break;
            case 91:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\rdata\\la30.fjs"));
                break;
            case 92:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la01.fjs"));
                break;
            case 93:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la02.fjs"));
                break;
            case 94:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la03.fjs"));
                break;
            case 95:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la04.fjs"));
                break;
            case 96:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la05.fjs"));
                break;
            case 97:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la06.fjs"));
                break;
            case 98:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la07.fjs"));
                break;
            case 99:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la08.fjs"));
                break;
            case 100:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la09.fjs"));
                break;
            case 101:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la10.fjs"));
                break;
            case 102:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la11.fjs"));
                break;
            case 103:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la12.fjs"));
                break;
            case 104:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la13.fjs"));
                break;
            case 105:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la14.fjs"));
                break;
            case 106:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la15.fjs"));
                break;
            case 107:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la16.fjs"));
                break;
            case 108:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la17.fjs"));
                break;
            case 109:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la18.fjs"));
                break;
            case 110:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la19.fjs"));
                break;
            case 111:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la20.fjs"));
                break;
            case 112:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la21.fjs"));
                break;
            case 113:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la22.fjs"));
                break;
            case 114:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la23.fjs"));
                break;
            case 115:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la24.fjs"));
                break;
            case 116:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la25.fjs"));
                break;
            case 117:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la26.fjs"));
                break;
            case 118:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la27.fjs"));
                break;
            case 119:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la28.fjs"));
                break;
            case 120:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la29.fjs"));
                break;
            case 121:
                file = new File(basePath.concat("\\src\\ProblemSets\\Hunrik\\vdata\\la30.fjs"));
                break;


        }


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st = "";
            String problem = "";
            while ((st = br.readLine()) != null) {
                problem += st.trim() + "\n";
            }

            String[] seperatedLines = problem.split("\\n");
//            for(int i =0;i<seperatedLines.length;i++){
//                System.out.println(seperatedLines[i]);
//            }

            int[] flexibleMachines = new int[5];
            double[] processingSpeed = new double[Integer.parseInt(seperatedLines[0].split("\\s")[1])];
            int numberOfMachines = Integer.parseInt(seperatedLines[0].split("\\s")[1]);

            for (int i = 1; i < seperatedLines.length; i++) {
                String jobString = seperatedLines[i];

                String[] operationsInfo = jobString.trim().split("[\\s]");

                Job job = new Job("Job " + i);
                int operationNumber = 0;
                for (int j = 1; j < operationsInfo.length; j++) {
                    int numberOfMachineForOperation = Integer.parseInt(operationsInfo[j]);
                    flexibleMachines = new int[numberOfMachineForOperation];
                    processingSpeed = new double[processingSpeed.length];
                    int count = 0;
                    for (int k = j + 1; count < numberOfMachineForOperation; k += 2) {

                        int machine = Integer.parseInt(operationsInfo[k])- 1 ;
                        double speed = Integer.parseInt(operationsInfo[k + 1]);
                        flexibleMachines[count] = machine;
                        processingSpeed[machine] = speed;

                        count++;
                        j += 2;
                    }
                    Operation operation = new Operation(flexibleMachines, processingSpeed, operationNumber);
                    operationNumber++;
                    job.addOperation(operation);
                    job.setNumberOfMachines(numberOfMachines);
                }

                jobs.add(job);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jobs;
    }
}
