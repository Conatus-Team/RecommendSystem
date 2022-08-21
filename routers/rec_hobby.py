"""
취미 추천
"""


from fastapi import APIRouter, Depends, HTTPException, Request
from pydantic import BaseModel
from typing import List
from conn.db_class import *
import pandas as pd
import json
# from ..dependencies import get_token_header

pd.set_option('display.max_rows', None)
pd.set_option('display.max_columns', None)
pd.set_option('display.width', 1000)
pd.set_option('display.colheader_justify', 'center')
pd.set_option('display.precision', 3)

# 라우터 정보 기입
router = APIRouter(
    prefix="/hobby",
    tags=["hobby"],
    # dependencies=[Depends(get_token_header)],
    responses={404: {"description": "Not found"}},
)

def parse_csv(df):
    res = df.to_json(orient="records")
    parsed = json.loads(res)
    return parsed

# DB 연결
@router.get("/")
async def recommend_hobby(request: Request):
    db_conn = request.state.db_conn
    
    # db 읽고 pandas dataframe으로 만들기
    hobby_list = pd.read_sql("hobby", db_conn).drop(columns=["created_time", "updated_time"])
    hobby_preference = pd.read_sql("hobby_preference", db_conn).drop(columns=["created_time", "updated_time"])
    user_hobby = pd.read_sql("user_hobby", db_conn).drop(columns=["created_time", "updated_time"])
    group_activity = pd.read_sql("user_group", db_conn).drop(columns=["created_time", "updated_time"])

    #


    return parse_csv(hobby_list)


    

    