void generate(char **result, char *tmp, int l, int r, int *Size, int index){
  
    if( l==0 && r==0 ){ 
        result[*Size] = (char *)malloc( sizeof(char)*(index+1) );
        
        for( int i=0 ; i<index ; i++ ){
            result[*Size][i] = tmp[i];
        }
        result[*Size][index] = '\0';
        
        (*Size)++;
        return;
    }
    if( l>0 ){  
        tmp[index] = '(';
        generate(result, tmp, l-1, r, Size, index+1);
    }
    if( r>0 && r>l ){ 
        tmp[index] = ')';
        generate(result, tmp, l, r-1, Size, index+1);
    }
}

char ** generateParenthesis(int n, int* returnSize){
    char **ans = (char**)malloc( sizeof(char*)*(10000) );
    char *temp = (char*)malloc( sizeof(char)*(2*n+1) ); 
    *returnSize = 0;
    int l = n, r = n; 
    
    generate(ans, temp, l, r, returnSize, 0);
    free(temp);
    return ans;
}