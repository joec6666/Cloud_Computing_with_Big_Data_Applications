package stubs;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class LetterMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	
	Text text = new Text();
	IntWritable intWritable = new IntWritable();
	
	@Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

//		String line = value.toString();
//
//		for (String word : line.split("\\W+")) {
//			if (word.length() > 0) {
//				text.set(word.substring(0, 1));
//				intWritable.set(word.length());
//				context.write(text, intWritable);
//			}
//		}
		
		context.write(value, new IntWritable(999));
		
	}
}
